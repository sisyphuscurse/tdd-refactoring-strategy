本项目旨在演示如何利用测试驱动开发实践与代码重构技术完成需求变化过程中如何改善现有设计。

开发环境：
操作系统 	OSX 10.12.2 
开发工具 	IntelliJ IDEA 2016.2.4
快捷键Map   	Mac OSX
JDK 		1.8.0_25
Maven		3.0.5

选择3个方法display、swim和quack，以便将其上推至父类。
由于display方法对应两种鸭子的行为不同，所以在选择上推到父类的方法时，将其标记为abstract。
与之相反,swim和quack方法对应两种鸭子行为相同，所以不需要将其标记为abstract。
