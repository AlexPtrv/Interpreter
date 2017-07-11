public class Runner {
    public static void main(String[] args) {
        Expression isJava=getJavaExpression();
        Expression isJavaEE=getJavaEEExpression();
        System.out.println("Java?? "+isJava.interpret("Java "));
        System.out.println("JavaEE?? "+isJavaEE.interpret("Java Spring"));

    }
    public static Expression getJavaExpression(){
        Expression java=new TerminalExpression("Java");
        Expression javaCore=new TerminalExpression("Java Core");
        return new OrExpression(java,javaCore);
    }
    public static Expression getJavaEEExpression(){
        Expression java=new TerminalExpression("Java");
        Expression spring=new TerminalExpression("Spring");
        return new AndExpression(java,spring);
    }
}
