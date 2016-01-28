#  -ABML-
## 基于安卓ABML开发模型（AndroidAbstractBaseModelLogic）开发的demo
## PS: 
    * 本开发模型不建议使用全局变量(除实例化View外),请尽可能将界面和数据分离成单独的方法，用于后期更好的维护代码
    * 关于数据存储，建议使用Nosql。
        +  在程序运行时，将重要数据和比较大的数据存储在内部存储和SharedPreferences中，用来降低程序的内存使用。
        + （Java开发的程序占用的内存，呵呵。你懂得……）
    * 逻辑操作建议使用RXJava或handler。

## 介绍：
*  com.example.androidmvcdemo.AbstractActivity （抽象类）
    + 说明：用来存放抽象方法  (被基础方法层继承)
    - 继承关系：继承 Activity (被BaseActivity或DataActivity继承)
*  com.example.androidmvcdemo.BaseActivity （抽象类）
    + 说明：用来存放操作界面用的基础方法 
    - 继承关系：继承 AbstractActivity (or DataActivity)   
*  com.example.androidmvcdemo.DataActivity （抽象类）
    + 说明：用来存放操作数据用的基础方法
    - 继承关系：继承 BaseActivity (or AbstractActivity)
*  com.example.androidmvcdemo.LogicActivity
    + 说明：用来存放逻辑操作的类（逻辑线，用来定义复杂逻辑关系的类）
    - 继承关系：继承 DataActivity (or BaseActivity)
*  com.example.androidmvcdemo.Model
     + 说明：用来存放定义model的类
