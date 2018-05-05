package id.co.abadan.bayarpakesampah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentHome extends Fragment {
    Activity context;
    public FragmentHome() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        Button point = (Button)context.findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(context,PointActivity.class);
                startActivity(intent);
            }
        });
        Button isipoint = (Button)context.findViewById(R.id.isipoint);
        isipoint.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(context,IsipointActivity.class);
                startActivity(intent);
            }
        });
        Button tukarpoint = (Button)context.findViewById(R.id.tukarpoint);
        tukarpoint.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(context,TukarpointActivity.class);
                startActivity(intent);
            }
        });
        Button produk = (Button)context.findViewById(R.id.produk);
        produk.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(context,ProdukActivity.class);
                startActivity(intent);
            }
        });
    }

}