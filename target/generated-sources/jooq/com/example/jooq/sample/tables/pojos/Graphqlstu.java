/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.sample.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Graphqlstu implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String name;
    private String subject;
    private String marks;
    private String grade;

    public Graphqlstu() {}

    public Graphqlstu(Graphqlstu value) {
        this.id = value.id;
        this.name = value.name;
        this.subject = value.subject;
        this.marks = value.marks;
        this.grade = value.grade;
    }

    public Graphqlstu(
        String id,
        String name,
        String subject,
        String marks,
        String grade
    ) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.grade = grade;
    }

    /**
     * Getter for <code>test.graphqlstu.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for <code>test.graphqlstu.id</code>.
     */
    public Graphqlstu setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>test.graphqlstu.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>test.graphqlstu.name</code>.
     */
    public Graphqlstu setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>test.graphqlstu.subject</code>.
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Setter for <code>test.graphqlstu.subject</code>.
     */
    public Graphqlstu setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Getter for <code>test.graphqlstu.marks</code>.
     */
    public String getMarks() {
        return this.marks;
    }

    /**
     * Setter for <code>test.graphqlstu.marks</code>.
     */
    public Graphqlstu setMarks(String marks) {
        this.marks = marks;
        return this;
    }

    /**
     * Getter for <code>test.graphqlstu.grade</code>.
     */
    public String getGrade() {
        return this.grade;
    }

    /**
     * Setter for <code>test.graphqlstu.grade</code>.
     */
    public Graphqlstu setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Graphqlstu other = (Graphqlstu) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (subject == null) {
            if (other.subject != null)
                return false;
        }
        else if (!subject.equals(other.subject))
            return false;
        if (marks == null) {
            if (other.marks != null)
                return false;
        }
        else if (!marks.equals(other.marks))
            return false;
        if (grade == null) {
            if (other.grade != null)
                return false;
        }
        else if (!grade.equals(other.grade))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.subject == null) ? 0 : this.subject.hashCode());
        result = prime * result + ((this.marks == null) ? 0 : this.marks.hashCode());
        result = prime * result + ((this.grade == null) ? 0 : this.grade.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Graphqlstu (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(subject);
        sb.append(", ").append(marks);
        sb.append(", ").append(grade);

        sb.append(")");
        return sb.toString();
    }
}