package com.startup.cureintime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Illnesses extends Fragment {

	View v;
	Button btnIllness;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		v = inflater.inflate(R.layout.illnesses, container, false);
		setup();
		return v;
	}

	private void setup() {
		btnIllness = (Button) v.findViewById(R.id.btnIllness);
		btnIllness.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(getActivity(), DrugList.class));
			}
		});
	}

}
