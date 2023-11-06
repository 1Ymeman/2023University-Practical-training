package 方法参数.test01;




public class Customer {//创建一个Customer类
    //定义了一个数组
    String []names = new String[30];//定义一个数组，数组长度为30
    /**
     * 增加姓名
     * @param name 输入的名字
     */
    //有参的方法，需要传入增加的姓名
    public void addName(String name){//添加姓名
        for(int i=0;i<names.length;i++){//使用for循环增加用户名字
            if(names[i]==null){//如果当前值为空的话，将传过来的参数赋值给它
                names[i]=name;// 把name的值赋值给names[i]
                break;//跳出循环
            }
        }
    }
    /**
     * 显示姓名
     */
    public void showNames(){//需要查询的用户的姓名，不需要返回值
        System.out.println("****************");//为了输出格式更好看
        System.out.println("客户姓名列表");
        System.out.println("****************");
        for(int i=0;i<names.length;i++){//使用for循环查询用户的姓名
            if(names[i]!=null){//如果当前位置不为空值，则输出内容
                System.out.print(names[i]+" ");
            }
        }
        System.out.println();
    }
    /**
     * 修改姓名
     */
    public boolean editName(String oldName,String newName){//定义了一个boolean类型返回值
        boolean find = false;
        for(int i=0;i<names.length;i++){//使用for循环，根据长度进行数组遍历
            if(names[i].equals(oldName)){//遍历数组，对oldName进行值的比较
                names[i] = newName;//如果一样的话就把newName赋值给names[i]
                find = true;//如果一直没有找到oldName的值，则返回之前的值，修改失败。
                break;//跳出循环
            }
        }
        return find;
    }
}




