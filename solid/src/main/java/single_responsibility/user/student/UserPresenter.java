package single_responsibility.user.student;

public class UserPresenter implements Presenter{
    @Override
    public void present(User user) {
        System.out.println(user.getAge() + ":" +user.getEmail());
    }
}
