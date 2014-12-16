package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class FragmentHome extends Fragment {
	
	public FragmentHome(){}
	ImageButton taskButton;
	ImageButton todayButton;
	ImageButton examButton;
	ImageButton classButton;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        
        // Button inflator
        taskButton = (ImageButton) rootView.findViewById(R.id.tasksButton);
        todayButton = (ImageButton) rootView.findViewById(R.id.todayButton);
        examButton = (ImageButton) rootView.findViewById(R.id.examButton);
        classButton = (ImageButton) rootView.findViewById(R.id.classButton);
        
        
        // Task Button Click
        taskButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		       MainActivity mActivity = (MainActivity)getActivity();
		       mActivity.displayView(2);
		       
		      
		       
				
			}
		});
        
        // Today Button Click
          todayButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
		       MainActivity mActivity = (MainActivity)getActivity();
		       mActivity.displayView(2);
		       
		      
		       
				
			}
		});

          
          // Exams Button Click
          
          examButton.setOnClickListener(new OnClickListener() {
  			
  			@Override
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  		       MainActivity mActivity = (MainActivity)getActivity();
  		       mActivity.displayView(4);
  		       
  		      
  		       
  				
  			}
  		});
          
          classButton.setOnClickListener(new OnClickListener() {
  			
  			@Override
  			public void onClick(View v) {
  				// TODO Auto-generated method stub
  		       MainActivity mActivity = (MainActivity)getActivity();
  		       mActivity.displayView(3);
  		       
  		      
  		       
  				
  			}
  		});

        return rootView;
    }
}








































