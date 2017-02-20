package study.num;

/**
 * Created by wqkenqing on 2017/2/16.
 */
public enum Season {
    SPRING("春天");
    private final String name;
    private Season(String name)
    {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
