package com.example.cfs.Controller;

import com.example.cfs.model.student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class studentController {

//    @GetMapping("/StudentDetails")
//    public student getStudent(){
//        return  new student(41,85,"Arya");
//    }

//    @GetMapping("/StudentDetails/{id}")
//    public student getStudent(){
//        return  new student(41,85,"Arya");
//    }

    // Path-Varible
//    @GetMapping("/StudentDetails/{id}")
//    public String getStudent(@PathVariable int id){
//        return  "Student id is"+id;
//    }
//    @GetMapping("/StudentDetails/{id}")
//    public student getStudent(@PathVariable int id){
//        return  new student(id,95,"Riya");
//    }

    // Request-Parameter
//    @GetMapping("/StudentDetails/Search")
//     public String getStudent(@RequestParam String Course){
//        return "Search Student for Course:"+Course;
//    }

    // Passing Multiple-Parameter
//        @GetMapping("/StudentDetails/Search")
//         public String getStudent(@RequestParam String Course,@RequestParam(defaultValue = "4999") int Price){
//            return "Search Student for Course:"+Course +"And Their Price is"+Price;
//        }

      // Post-API
    // Responsebody
    @PostMapping("/Create")
         public String CreateStudent(@RequestBody student request){
          return "Student Created"+request.getName();
    }

    //ResponseEntity
    @GetMapping("/Create/{id}")
    public ResponseEntity<String> getStudent(@PathVariable int id){
        if(id<=0){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid Status Id");
        }
        return  ResponseEntity.ok("Student Found");
    }
}
