package nyc.c4q.workforce1.events_rv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.workforce1.R;
import nyc.c4q.workforce1.model.DummyData;
import nyc.c4q.workforce1.model.Event;

/**
 * Created by D on 3/3/18.
 */

public class Events_Adapter extends RecyclerView.Adapter<Events_Holder> {

    List<Event> eventList;

    public Events_Adapter(List<Event> eventList) {
        this.eventList = eventList;
    }


    @Override
    public Events_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childview = LayoutInflater.from(parent.getContext()).inflate(R.layout.events_itemview,parent,false);
        return new Events_Holder(childview);
    }

    @Override
    public void onBindViewHolder(Events_Holder holder, int position) {
        Event event = eventList.get(position);
        holder.onBind(event);
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}
