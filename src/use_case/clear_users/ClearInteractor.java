package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {

    final ClearUserDataAccessInterface userDataAccessObject;

    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    public String execute(){
        String cleared_users = userDataAccessObject.clear();
        ClearOutputData clearOutputData = new ClearOutputData(false, cleared_users);
        clearPresenter.prepareSuccessView(clearOutputData);
        return cleared_users;
    }

}
