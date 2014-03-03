package myshroff.android.temperature;
/* 
 * Margi Shroff - Main Activity
 */
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText text;
	private TextView inputUnit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text = (EditText)findViewById(R.id.editText1);
		inputUnit = (TextView)findViewById(R.id.textView1);
	}

	public void onClick(View view)
	{
		if(view.getId() == R.id.button1)
		{
			RadioButton celsiusButton = (RadioButton)findViewById(R.id.radio0);
			RadioButton fahrenheitButton = (RadioButton)findViewById(R.id.radio1);
			
			if(text.getText().length() == 0)
			{
				Toast.makeText(this,"Please enter valid number", Toast.LENGTH_LONG).show();
				return;
			}
			
			float inputValue = Float.parseFloat(text.getText().toString());
			
			if(celsiusButton.isChecked())
			{
				text.setText(String.valueOf(ConverterUtil.covertFtoC(inputValue)));
				celsiusButton.setChecked(true);
				fahrenheitButton.setChecked(false);
				
				inputUnit.setText("Celsius");
			}
			else
			{
				text.setText(String.valueOf(ConverterUtil.covertCtoF(inputValue)));
				celsiusButton.setChecked(false);
				fahrenheitButton.setChecked(true);
				inputUnit.setText("Fahrenheit");
			}	
		}
	}
			 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
