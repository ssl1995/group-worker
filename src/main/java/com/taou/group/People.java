package com.taou.group;

/**
 * @author SongShengLin
 * @date 2021/9/16 10:36 下午
 * @description
 */

class People {
    // 部门
    private String department;
    // 性别：0-男，1-女
    private int sex;
    // 年纪：用当前年-出生年
    private int age;
    // 入职时间：
    private String hireDate;
    // 级别：只有0和6级
    private int level;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public People() {
    }

    public People(String department, int sex, int age, String hireDate, int level) {
        this.department = department;
        this.sex = sex;
        this.age = age;
        this.hireDate = hireDate;
        this.level = level;
    }
}
