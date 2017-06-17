package isfaaghyth.app.mvp.view.main;

import android.os.Bundle;

import isfaaghyth.app.mvp.R;
import isfaaghyth.app.mvp.base.BaseActivity;
import isfaaghyth.app.mvp.presenter.main.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView {

    @Override protected MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
