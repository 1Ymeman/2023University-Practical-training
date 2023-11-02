package 类与对象.上机任务6;

// 电池类
class 电池 {
    private int 电量;

    public 电池() {
        this.电量 = 0;
    }

    public void 存电(int 电量) {
        this.电量 += 电量;
        System.out.println("已存入电量：" + 电量);
    }

    public void 充电() {
        System.out.println("正在充电...");
        this.电量 = 100;
        System.out.println("充电完成，电量已满");
    }

    public int 获取电量() {
        return 电量;
    }
}

// 手机类
class 手机 {
    private 电池 电池;
    private String[] 音乐列表;

    public 手机() {
        this.电池 = new 电池();
        this.音乐列表 = new String[0];
    }

    public void 下载音乐(String 音乐) {
        String[] 新音乐列表 = new String[音乐列表.length + 1];
        for (int i = 0; i < 音乐列表.length; i++) {
            新音乐列表[i] = 音乐列表[i];
        }
        新音乐列表[音乐列表.length] = 音乐;
        音乐列表 = 新音乐列表;
        System.out.println("已下载音乐：" + 音乐);
    }

    public void 播放音乐() {
        if (音乐列表.length == 0) {
            System.out.println("没有可播放的音乐");
        } else {
            System.out.println("正在播放音乐：" + 音乐列表[0]);
        }
    }

    public void 充电() {
        电池.充电();
    }

    public void 显示电量() {
        System.out.println("当前电量：" + 电池.获取电量());
    }
}

// 测试类
public class TestPhone {
    public static void main(String[] args) {
        手机 手机1 = new 手机();
        手机1.下载音乐("歌曲1");
        手机1.下载音乐("歌曲2");
        手机1.播放音乐();
        手机1.充电();
        手机1.显示电量();
    }
}