# Java_Abstract-Interface
Java 抽象类和接口的练习

#### [一] 编写程序表示职员的基本信息与薪酬计算：
1.定义抽象类  Employee  表示职员
 包含受保护的属性：姓名，基本工资，家庭住址，该月休假数；为Employee类提供构造函数，为每个属性赋值；编写show()方法显示所有信息；编写方法：calculateLessPay（） 计算扣除
规则为无休假不扣除，5天以内（包含5天）扣除基本工资的4分之1，超过5天扣除基本工资的一半。编写抽象方法calculateTotal（）计算工资总额。
2.编写子类Director 表示董事长
   包含私有属性transportAllowance 表示交通补助
   给该类提供构造函数，给每个属性赋值，注意使用super
		重写calculateTotal（）方法计算董事长的工资总额，计算标准为：
   基本工资+岗位津贴5000+交通补助
	 	重写show（）方法显示基本信息，并显示董事长的总工资和实际工资（总工资-应扣工资）
     3.编写子类 Manager 表示部门经理
		 类中包含私有属性：Department 表示部门
	  给该类提供构造函数，给每个属性赋值，注意使用super
		重写calculateTotal（）方法计算部门经理的工资总额，计算标准为：
       基本工资+岗位津贴1500+绩效工资:基本工资的20%。
			重写show（）方法，显示基本信息，所在部门名称，以及总工资与实际工资（总工资-应扣工资）
4.在测试类中分别创建董事长与部门经理的实例，分别调用show（）方法显示信息。




#### 二.使用抽象概念定义电话的继承体系
  A.定义抽象类电话：包含抽象方法 
void sendCall(String name) ; 打电话
Void getCall(String name); 接电话
  B.定义 上网设备接口 Net 
  包含抽象方法  getInterNet();
  C.定义 用电设备接口  Elec
  包含抽象方法  on();  off();
  D.定义手机类，能打电话接电话 发短信还能上网以及能开机关机。
  F.定义电脑类，能开机关机 能上网
在测试类中测试手机与电脑的功能。
