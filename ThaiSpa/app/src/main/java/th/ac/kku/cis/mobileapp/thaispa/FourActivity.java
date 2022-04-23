package th.ac.kku.cis.mobileapp.thaispa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        final EditText name = findViewById(R.id.editname);
        final EditText phone = findViewById(R.id.editphone);
        Button btn =findViewById(R.id.booking_button);
        DAO dao = new DAO();
        btn.setOnClickListener(v->{

            Booking booking = new Booking(name.getText().toString(),phone.getText().toString());
            dao.add(booking).addOnSuccessListener(suc->{
                Toast.makeText(this,"Booking is inserted",Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er ->{
                Toast.makeText(this,""+er.getMessage(),Toast.LENGTH_SHORT).show();
            });

        });




    }
}