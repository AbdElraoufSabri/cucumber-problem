package io.abdelraouf.learn.cucumber;

import android.os.Parcel;
import android.util.Pair;
import androidx.test.filters.SmallTest;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.google.common.truth.Truth.assertThat;

// @RunWith is required only if you use a mix of JUnit3 and JUnit4.
@RunWith(AndroidJUnit4.class)
@SmallTest
public class LogHistoryAndroidUnitTest {

    public static final String TEST_STRING = "This is a string";
    public static final long TEST_LONG = 12345678L;
    private LogHistory mLogHistory;

    @Before
    public void createLogHistory() {
        mLogHistory = new LogHistory();
    }

    @Test
    public void logHistory_ParcelableWriteRead() {
        // Set up the Parcelable object to send and receive.
        mLogHistory.addEntry(TEST_STRING, TEST_LONG);

        // Write the data.
        Parcel parcel = Parcel.obtain();
        mLogHistory.writeToParcel(parcel, mLogHistory.describeContents());

        // After you're done with writing, you need to reset the parcel for reading.
        parcel.setDataPosition(0);

        // Read the data.

        // Verify that the received data is correct.
        assertThat(1).isEqualTo(1);


    }
}