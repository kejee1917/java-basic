package construct;

public class MemberThis {

    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 이런 경우는 this. 생략가능
        //this.nameField = nameParameter;
    }
}
