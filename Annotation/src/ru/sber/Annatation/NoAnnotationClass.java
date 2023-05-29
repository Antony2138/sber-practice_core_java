package ru.sber.Annatation;


public class NoAnnotationClass {
    @Plan(hours = 10, precedence = -1, specification = "Возвращает текст c аннотацией")
    @Plan(hours = 15)
    @Plan(hours = 20, precedence = 1)
    public void setData( String specification) {

        this.BaseClass.container.setSpecification(specification);

    }
}
