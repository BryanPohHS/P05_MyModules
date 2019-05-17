package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity
{
  //Declare fields
  TextView tv_getModuleCode, tv_getModuleName, tv_getAcademicYear, tv_getSem, tv_getCredit, tv_getVenue;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_module_detail);

    tv_getModuleCode = findViewById(R.id.tv_getModuleCode);
    tv_getModuleName = findViewById(R.id.tv_getModuleName);
    tv_getAcademicYear = findViewById(R.id.tv_getAcademicYear);
    tv_getSem = findViewById(R.id.tv_getSem);
    tv_getCredit = findViewById(R.id.tv_getModuleCredit);
    tv_getVenue = findViewById(R.id.tv_getVenue);

    Intent intentRecieved = getIntent();
    String moduleCode = intentRecieved.getStringExtra("Code");
    String moduleName = intentRecieved.getStringExtra("Name");
    String moduleYear = intentRecieved.getStringExtra("Year");
    String moduleSemester = intentRecieved.getStringExtra("Semester");
    String moduleCredit = intentRecieved.getStringExtra("Credit");
    String moduleVenue = intentRecieved.getStringExtra("Venue");

    tv_getModuleCode.setText(moduleCode);
    tv_getModuleName.setText(moduleName);
    tv_getAcademicYear.setText(moduleYear);
    tv_getSem.setText(moduleSemester);
    tv_getCredit.setText(moduleCredit);
    tv_getVenue.setText(moduleVenue);

  }
}
