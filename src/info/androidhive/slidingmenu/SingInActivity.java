
package info.androidhive.slidingmenu;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class SingInActivity extends Activity implements OnClickListener{
Button myButton;
DatabaseHandler dbhandle = new DatabaseHandler(this);
Intent intent;
EditText myUser;
EditText myPass;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.log_on);
		 intent = new Intent (this, MainActivity.class);
		myButton =  (Button)findViewById(R.id.signButton);
		
		
		
		// create a Singin Database
		
		 dbhandle.addContact(new Contact("a", "a"));        
	        dbhandle.addContact(new Contact("alish", "nau012"));
	        dbhandle.addContact(new Contact("halim", "nau123"));
	        dbhandle.addContact(new Contact("amyra", "nau111"));
	        dbhandle.addContact(new Contact("jose", "jose123"));
	        
	   // check for username and password
	    	myButton.setOnClickListener(this);
	    	

	}// end Oncreate 
	
	public void onClick (View v){
		myUser = (EditText)findViewById(R.id.userEditText);
		myPass = (EditText)findViewById(R.id.passEditText);
		boolean check = true;
		List<Contact> contacts = dbhandle.getAllContacts(); 
		for (Contact cn : contacts){
			 
			 
	        if (cn.getName().equals(myUser.getText().toString()) && cn.getPhoneNumber().equals(myPass.getText().toString())){
	        	Toast.makeText(this, "Welcome " + myUser.getText().toString() , Toast.LENGTH_SHORT).show();
	        		startActivity(intent);
	        		
	        		check = false;
	      	}// end if
	        
	        	
	       } // end for each
	    if (check)
	    	Toast.makeText(this, "No username and password match found", Toast.LENGTH_SHORT).show();
	    	
			
			
		
			
			
		}
}