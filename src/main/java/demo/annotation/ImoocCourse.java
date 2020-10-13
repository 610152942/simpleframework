package demo.annotation;

@CourseInfoAnnotation(courseName = "剑指JAVA面试", courseTag = "面试", courseProfile = "广告")
public class ImoocCourse {
    @PersonInfoAnnotation(name="祥子", language = {"java", "python", "c++"})
    private String author;

    @CourseInfoAnnotation(courseName = "校园商铺",
            courseTag = "实战",
            courseProfile = "手把手教会从前端到后端开发多店铺商铺管理系统，"
                    + "可以用在毕设创业中，学习完会对SSM以及Springboot有一个"
                    + "全面的了解",
            courseIndex = 144)
    public void getCourseInfo(){

    }
}

