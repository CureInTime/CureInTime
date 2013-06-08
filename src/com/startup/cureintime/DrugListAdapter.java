package com.startup.cureintime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DrugListAdapter extends ArrayAdapter<String> {

	private final Context context;
	private final String[] values;

	public DrugListAdapter(Context context, String[] values) {
		super(context, R.layout.single_drug, values);
		this.context = context;
		this.values = values;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.single_drug, parent, false);
		TextView tvDrugName = (TextView) rowView.findViewById(R.id.tvDrugName);
		ImageView ivDrugImage = (ImageView) rowView.findViewById(R.id.ivDrugImage);
		
		tvDrugName.setText(values[position]);
		ivDrugImage.setImageResource(R.drawable.pill);

		return rowView;
	}

}
