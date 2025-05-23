package com.ShiXi.utils;

import com.ShiXi.dto.StudentDTO;


public class StudentHolder {
    private static final ThreadLocal<StudentDTO> tl = new ThreadLocal<>();

    public static void saveUser(StudentDTO student){
        tl.set(student);
    }

    public static StudentDTO getStudent(){
        return tl.get();
    }

    public static void removeStudent(){
        tl.remove();
    }
}
