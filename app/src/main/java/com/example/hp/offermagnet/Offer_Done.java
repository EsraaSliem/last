package com.example.hp.offermagnet;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Offer_Done extends Fragment {
Button btnDone;

    public Offer_Done() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_offer__done, container, false);
        btnDone=(Button)v.findViewById(R.id.btnBackOffer);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment offer = new One();
                FragmentManager ft = getFragmentManager();
                ft.beginTransaction().replace(R.id.frameDoneOffer, offer).commit();
            }
        });


        return v;
    }

}
