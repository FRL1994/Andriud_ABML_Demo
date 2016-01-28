# -ABML-
##基于安卓ABML开发模型（AndroidAbstractBaseModelLogic）开发的demo
##PS:本开发模型不建议使用全局变量(除实例化View外),请尽可能将界面和数据分离成单独的方法，用于后期更好的维护代码

介绍：
*  com.example.androidmvcdemo.AbstractActivity 
    + 说明：用来存放抽象方法（抽象类）
    - 继承关系：继承 Activity (被BaseActivity或DataActivity继承)
*  com.example.androidmvcdemo.BaseActivity 
    + 用来存放操作界面用的基础方法（抽象类）
    - 继承关系：继承 AbstractActivity (or DataActivity)   
*  com.example.androidmvcdemo.DataActivity 
    + 用来存放操作数据用的基础方法（抽象类）
    - 继承关系：继承 BaseActivity (or AbstractActivity)
*  com.example.androidmvcdemo.LogicActivity
    + 用来存放逻辑操作的类（逻辑线，用来定义复杂逻辑关系的类）
    - 继承关系：继承 DataActivity (or BaseActivity)
*  com.example.androidmvcdemo.Model
     + 用来存放定义model的类
