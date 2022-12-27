<h1 align="center">Annotation</h1>

Java annotation can be used to define the metadata of a Java class or class element. We can use Java annotation at the compile time to instruct the compiler about the build process. Annotation is also used at runtime to get insight into the properties of class elements.

Java annotation can be added to an element in the following way:

@Entity
Class DemoClass{

}

We can also set a value to the annotation member. For example:

@Entity(EntityName="DemoClass")
Class DemoClass{

}

In Java, there are several built-in annotations. You can also define your own annotations in the following way:

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
   String userRole() default "GUEST";
}

- If an @Target meta-annotation is not present on an annotation interface T, then an annotation of type T may be written as a modifier for any declaration.

- If an @Target meta-annotation is present, the compiler will enforce the usage restrictions indicated by ElementType enum constants.

- A Retention meta-annotation has effect only if the meta-annotated interface is used directly for annotation. It has no effect if the meta-annotated interface is used as a member interface in another annotation interface.

- Created an annotation interface named FamilyBudget.
- Inside the interface, created a String method named userRole() that has default set to "GUEST".
- Created an Integer method named budgetLimit() that has default set to 100.
- Then created a class named FamilyMember.
- Inside the class set a value to annotation member i.e. @FamilyBudget(userRole="SENIOR").
- Then created a public void return type method named seniorMember that takes two Integer variables as parameters (budget, moneySpend).
- Inside the method printing Senior member, moneySpend variable value and the budget left i.e. budget-moneySpend.
- Inside the class set a value to annotation member i.e. @FamilyBudget(userRole="SENIOR").
- Then created a public void return type method named seniorMember that takes two Integer variables as parameters (budget, moneySpend).
- Inside the method printing Senior member, moneySpend variable value and the budget left i.e. budget-moneySpend.
- 