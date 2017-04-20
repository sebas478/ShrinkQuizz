package com.phoenix.sebas.shrinkquizz.Views.Tabs;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.phoenix.sebas.shrinkquizz.Data.PartyResult;
import com.phoenix.sebas.shrinkquizz.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PartyFragment extends Fragment {


    public PartyFragment() {
        // Required empty public constructor
    }
public static PartyFragment newInstance(){
    return new PartyFragment();

}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_party, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.PartyRg);
        Button button = (Button) view.findViewById(R.id.PartyBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = radioGroup.getCheckedRadioButtonId();
                if (id != -1){
                    RadioButton radioButton = (RadioButton) radioGroup.findViewById(id);
                    String answer = radioButton.getText().toString();
                    showDialog(answer);

                }else {
                    Toast.makeText(getContext(),"seleccione una opcion", Toast.LENGTH_SHORT).show();

                }


            }
        });

    }

    private void showDialog(String answer){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Tu nivel de fiestero");
        alertDialog.setMessage(new PartyResult(answer).score());
        alertDialog.setPositiveButton("Yeah!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });
        alertDialog.show();

    }
}
