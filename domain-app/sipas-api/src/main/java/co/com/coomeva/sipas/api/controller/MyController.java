package co.com.coomeva.sipas.api.controller;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.coomeva.sipas.bpm.service.MyService;


@RestController
public class MyController {

	@Autowired
	private MyService myService;

	@RequestMapping(value = "/process")
	public String startProcessInstance(@RequestParam String assignee) {
		return myService.startProcess(assignee);
	}

	@RequestMapping(value = "/tasks/{assignee}")
	public String getTasks(@PathVariable("assignee") String assignee) {
		List<Task> tasks = myService.getTasks(assignee);
		return tasks.toString();
	}

	@RequestMapping(value = "/tasks/all")
	public String getTasks() {
		List<Task> tasks = myService.findAllTaskUser();
		return tasks.toString();
	}
	
	@RequestMapping(value = "/completetask")
	public String completeTask(@RequestParam String id) {
		myService.completeTask(id);
		return "Task with id " + id + " has been completed!";
	}

}

class PreidcateConsumerDemo {

	public static Student updateStudentFee(Student student, 
			Predicate<Student> predicate, 
			Consumer<Student> consumer){
		
		if ( predicate.test(student)){		
			consumer.accept(student);
		}
		return student;
	}
	
	public static void main(String[] args) {

		Student student1 = new Student("Ashok","Kumar", 9.5);

		student1 = updateStudentFee(student1,
				student -> student.grade > 8.5,
				student -> student.feeDiscount = 30.0);

		student1.printFee();
		Student student2 = new Student("Rajat","Verma", 8.0);
		student2 = updateStudentFee(student2, 
				student -> student.grade >= 8,
				student -> student.feeDiscount = 20.0);

		student2.printFee();

	}

}


class Student{
	String firstName;
	String lastName;
	Double grade;
	Double feeDiscount = 0.0;
	Double baseFee = 20000.0;

	public Student(String firstName, String lastName, 
			Double grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}

	public void printFee(){
		Double newFee = baseFee - ((baseFee*feeDiscount)/100);
		System.out.println("The fee after discount: "+newFee);
	}
}
