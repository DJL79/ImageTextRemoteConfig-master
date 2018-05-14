package uk.co.apptouch.imagetextremoteapps;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    View myView;

    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView=inflater.inflate(R.layout.fragment_one, container, false);

        MainActivity bbb = new MainActivity();
      //  bbb.displayWelcomeMessage();
        String xxx = bbb.textViewContentGet;
       // TextView text = (TextView) myView.findViewById(R.id.txtViewFragOne1);
        //text.setText(xxx);

        Log.d("xxx", "Value of text: " + xxx);

        return myView;

    }


}
