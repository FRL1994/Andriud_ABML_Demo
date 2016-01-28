# -ABML-
##基于安卓ABML开发模型（AndroidAbstractBasisModelLogic）开发的demo

介绍：

*  com.example.androidmvcdemo.AbstractActivity 
    + 说明：用来存放抽象方法（抽象类）
    - 继承关系：继承 Activity (被BaseActivity或DataActivity继承)
*  com.example.androidmvcdemo.BaseActivity 
    + 用来存放操作界面用的基础方法（抽象类）
    - 继承关系：继承 AbstractActivity (or DataActivity)   
*  com.example.androidmvcdemo.DataActivity 
    + 用来存放操作数据用的基础方法（抽象类）
    - 继承关系：继承 DataActivity (or AbstractActivity)
