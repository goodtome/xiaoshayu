import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        // 添加while 循环条件

        while (true){
            System.out.println("-----欢迎使用小鲨鱼记账-----");
            System.out.println("1、收支明细");
            System.out.println("2、登记收入");
            System.out.println("3、登记支出");
            System.out.println("4、退出");
            System.out.println("请输入你要选择的功能: ");

            //键盘录入，扫描器
            Scanner sc =new Scanner(System.in);

            //接受键盘录入的int类型的数据
            int choice = sc.nextInt();

            //对录入的choice进行过滤
            while (choice !=1 & choice!=2 & choice != 3 & choice != 4){
                System.out.println("输入错误，请重新输入！");
                int  newchoice = sc.nextInt(); //重新输入键盘事件
                choice = newchoice; //覆盖原来的键盘事件
            }

            //键盘事件的判断
            switch(choice){
                case 1:
                    System.out.println("记账系统》》》收支明细");
                    break;
                case 2:
                    System.out.println("记账系统》》》登记收入");
                    break;
                case 3:
                    System.out.println("记账系统》》》登记支出");
                    break;
                case 4:
                    System.out.println("记账系统》》》退出功能");
                    return;// 结束当前运行
            }
       }
    }
}
