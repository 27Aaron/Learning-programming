package Java.P29;
/*
 *  变量的分类：
 *     变量可以根据定义的/声明的位置来进行分类，可以分为两大类：
 *        一类：局部变量
 *        另一类：成员变量
 *              静态变量
 *              实例变量
 * 
 */
public class VarTest05 {
    public static void main(String[] args) {
        
        // 凡是在方法体当中定义的变量，一定是局部变量。
        // 局部变量只在当前方法体当中有效。

        int a = 100;
 
    }

    // 在类体当中定义的变量叫做成员变量。
    // 实例变量
    int b = 200;

    //静态变量
    static int c = 300;
}
