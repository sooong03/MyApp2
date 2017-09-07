package kr.anima.xd.s.myapp2.init;

import android.os.AsyncTask;

/**
 * Created by alfo6-10 on 9/4/2017.
 */

public class InitAsyncTask extends AsyncTask <Void, String, Boolean> {



    public InitAsyncTask() {
    }

    @Override
    protected Boolean doInBackground(Void... voids) {
        // password ?
        return true;
    }


    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }


    @Override
    protected void onPostExecute(Boolean result) {
        super.onPostExecute(result);
    }

}
