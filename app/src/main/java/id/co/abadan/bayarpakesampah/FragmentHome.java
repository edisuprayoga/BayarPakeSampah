package id.co.abadan.bayarpakesampah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

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
        ImageButton point = (ImageButton)context.findViewById(R.id.point);
        point.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(context,PointActivity.class);
                startActivity(intent);
            }
        });
        ImageButton isipoint = (ImageButton)context.findViewById(R.id.isipoint);
        isipoint.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(context,IsipointActivity.class);
                startActivity(intent);
            }
        });
        ImageButton tukarpoint = (ImageButton)context.findViewById(R.id.tukarpoint);
        tukarpoint.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(context,TukarpointActivity.class);
                startActivity(intent);
            }
        });
        ImageButton produk = (ImageButton)context.findViewById(R.id.produk);
        produk.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(context,ProdukActivity.class);
                startActivity(intent);
            }
        });
    }

}