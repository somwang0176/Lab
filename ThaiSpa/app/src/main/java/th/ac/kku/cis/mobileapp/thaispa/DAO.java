package th.ac.kku.cis.mobileapp.thaispa;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAO {
    private DatabaseReference databaseReference;
    public DAO(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Booking.class.getSimpleName());
    }
    public Task<Void> add(Booking booking){

        return databaseReference.push().setValue(booking);
    }
}
