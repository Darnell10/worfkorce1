package nyc.c4q.workforce1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import nyc.c4q.workforce1.model.Job;
import nyc.c4q.workforce1.presenter.FilterPresenter;

import static org.mockito.Mockito.*;

/**
 * Created by C4Q on 3/4/18.
 */

public class FilterPresenterTest {

    @Mock
    Job mockJob;

    @Mock
    FilterPresenter filterPresenter;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        // configure our mocks... remember, mock methods are just stubs:
        // unless we tell the mock what to return when the stub is called, it will just return null.
        // let's return the mockData object instead, so we can verify that the return value of api.getData()
        //is really what we're storing in the database.

//        when(mockApi.getData()).thenReturn(mockData);
//
//        myPresenter = new MyPresenter(mockDatabase, mockApi);
    }


    @Test
    public void fetchAndStoreData_storesApiResponseInDatabase() {

        // first, call the method we want to test
//        myPresenter.fetchAndStoreData();
//
//        // next, verify that the expected actions were invoked on our mock dependencies
//        verify(mockApi).getData();
//
//        // remember, since our mockApi is returning mockData, we want to verify that this is exactly what we're storing
//        verify(mockDatabase).addData(mockData);

        // if this test passes, then fetchAndStoreData() is behaving as expected!
    }
}
