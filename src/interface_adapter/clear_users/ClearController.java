package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInputBoundary;
public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;
    public ClearController(ClearInputBoundary clearUseCaseInteractor){
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public String execute(){
        return clearUseCaseInteractor.execute();
    }

}
