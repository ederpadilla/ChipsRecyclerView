package dev.eder.padilla.chiplayoutmanager;

import android.support.annotation.IntRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;

import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.beloo.widget.chipslayoutmanager.SpacingItemDecoration;
import com.beloo.widget.chipslayoutmanager.gravity.IChildGravityResolver;
import com.beloo.widget.chipslayoutmanager.layouter.breaker.IRowBreaker;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view) RecyclerView recyclerView;

    List<Tag> tagList = new ArrayList<>();

    ChipsAdapter mChipsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpRecyclerView();
        tagList.add(new Tag(true,"Dev"));
        tagList.add(new Tag(false,"SDfsdfsdfs sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf df hola"));
        tagList.add(new Tag(true,"sfsdfsfsdf"));
        tagList.add(new Tag(false,"qwer"));
        tagList.add(new Tag(true,"effrsefsdfsdfs"));
        tagList.add(new Tag(false,"sfesdfsd"));
        tagList.add(new Tag(true,"sdsdf"));
        tagList.add(new Tag(false,"a"));
        tagList.add(new Tag(true,"fsxsd"));
        tagList.add(new Tag(false,"v"));
        tagList.add(new Tag(true,"b"));
        tagList.add(new Tag(false,"c"));
        tagList.add(new Tag(true,"123dsfsd"));
        tagList.add(new Tag(false,"dfsdf"));
        tagList.add(new Tag(true,"sdvr"));
        tagList.add(new Tag(false,"sdfdsdfsfsdfrfsesr"));
        tagList.add(new Tag(true,"Dev"));
        tagList.add(new Tag(false,"SDfsdfsdfs sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf df"));
        tagList.add(new Tag(true,"sfsdfsfsdf"));
        tagList.add(new Tag(false,"qwer"));
        tagList.add(new Tag(true,"effrsefsdfsdfs"));
        tagList.add(new Tag(false,"sfesdfsd"));
        tagList.add(new Tag(true,"sdsdf"));
        tagList.add(new Tag(false,"a"));
        tagList.add(new Tag(true,"fsxsd"));
        tagList.add(new Tag(false,"v"));
        tagList.add(new Tag(true,"b"));
        tagList.add(new Tag(false,"c"));
        tagList.add(new Tag(true,"123dsfsd"));
        tagList.add(new Tag(false,"dfsdf"));
        tagList.add(new Tag(true,"sdvr"));
        tagList.add(new Tag(false,"sdfdsdfsfsdfrfsesr"));
        tagList.add(new Tag(true,"Dev"));
        tagList.add(new Tag(false,"SDfsdfsdfs sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf df"));
        tagList.add(new Tag(true,"sfsdfsfsdf"));
        tagList.add(new Tag(false,"qwer"));
        tagList.add(new Tag(true,"effrsefsdfsdfs"));
        tagList.add(new Tag(false,"sfesdfsd"));
        tagList.add(new Tag(true,"sdsdf"));
        tagList.add(new Tag(false,"a"));
        tagList.add(new Tag(true,"fsxsd"));
        tagList.add(new Tag(false,"v"));
        tagList.add(new Tag(true,"b"));
        tagList.add(new Tag(false,"c"));
        tagList.add(new Tag(true,"123dsfsd"));
        tagList.add(new Tag(false,"dfsdf"));
        tagList.add(new Tag(true,"sdvr"));
        tagList.add(new Tag(false,"sdfdsdfsfsdfrfsesr"));
        tagList.add(new Tag(true,"Dev"));
        tagList.add(new Tag(false,"SDfsdfsdfs sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf df"));
        tagList.add(new Tag(true,"sfsdfsfsdf"));
        tagList.add(new Tag(false,"qwer"));
        tagList.add(new Tag(true,"effrsefsdfsdfs"));
        tagList.add(new Tag(false,"sfesdfsd"));
        tagList.add(new Tag(true,"sdsdf"));
        tagList.add(new Tag(false,"a"));
        tagList.add(new Tag(true,"fsxsd"));
        tagList.add(new Tag(false,"v"));
        tagList.add(new Tag(true,"b"));
        tagList.add(new Tag(false,"c"));
        tagList.add(new Tag(true,"123dsfsd"));
        tagList.add(new Tag(false,"dfsdf"));
        tagList.add(new Tag(true,"sdvr"));
        tagList.add(new Tag(false,"sdfdsdfsfsdfrfsesr"));
        tagList.add(new Tag(true,"Dev"));
        tagList.add(new Tag(false,"SDfsdfsdfs sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf df"));
        tagList.add(new Tag(true,"sfsdfsfsdf"));
        tagList.add(new Tag(false,"qwer"));
        tagList.add(new Tag(true,"effrsefsdfsdfs"));
        tagList.add(new Tag(false,"sfesdfsd"));
        tagList.add(new Tag(true,"sdsdf"));
        tagList.add(new Tag(false,"a"));
        tagList.add(new Tag(true,"fsxsd"));
        tagList.add(new Tag(false,"v"));
        tagList.add(new Tag(true,"b"));
        tagList.add(new Tag(false,"c"));
        tagList.add(new Tag(true,"123dsfsd"));
        tagList.add(new Tag(false,"dfsdf"));
        tagList.add(new Tag(true,"sdvr"));
        tagList.add(new Tag(false,"sdfdsdfsfsdfrfsesr"));
        tagList.add(new Tag(true,"Dev"));
        tagList.add(new Tag(false,"SDfsdfsdfs sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf df"));
        tagList.add(new Tag(true,"sfsdfsfsdf"));
        tagList.add(new Tag(false,"qwer"));
        tagList.add(new Tag(true,"effrsefsdfsdfs"));
        tagList.add(new Tag(false,"sfesdfsd"));
        tagList.add(new Tag(true,"sdsdf"));
        tagList.add(new Tag(false,"a"));
        tagList.add(new Tag(true,"fsxsd"));
        tagList.add(new Tag(false,"v"));
        tagList.add(new Tag(true,"b"));
        tagList.add(new Tag(false,"c"));
        tagList.add(new Tag(true,"123dsfsd"));
        tagList.add(new Tag(false,"dfsdf"));
        tagList.add(new Tag(true,"sdvr"));
        tagList.add(new Tag(false,"sdfdsdfsfsdfrfsesr"));
        tagList.add(new Tag(true,"Dev"));
        tagList.add(new Tag(false,"SDfsdfsdfs sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf sdf df"));
        tagList.add(new Tag(true,"sfsdfsfsdf"));
        tagList.add(new Tag(false,"qwer"));
        tagList.add(new Tag(true,"effrsefsdfsdfs"));
        tagList.add(new Tag(false,"sfesdfsd"));
        tagList.add(new Tag(true,"sdsdf"));
        tagList.add(new Tag(false,"a"));
        tagList.add(new Tag(true,"fsxsd"));
        tagList.add(new Tag(false,"v"));
        tagList.add(new Tag(true,"b"));
        tagList.add(new Tag(false,"c"));
        tagList.add(new Tag(true,"123dsfsd"));
        tagList.add(new Tag(false,"dfsdf"));
        tagList.add(new Tag(true,"sdvr"));
        tagList.add(new Tag(false,"sdfdsdfsfsdfrfsesr"));
        mChipsAdapter.notifyDataSetChanged();
        Log.w(MainActivity.class.getSimpleName(),"Size of "+tagList.size());

    }

    private void setUpRecyclerView() {
        ChipsLayoutManager chipsLayoutManager = ChipsLayoutManager.newBuilder(getApplicationContext())

                //set vertical gravity for all items in a row. Default = Gravity.CENTER_VERTICAL
                .setChildGravity(Gravity.TOP)
                //whether RecyclerView can scroll. TRUE by default
                .setScrollingEnabled(true)
                //set gravity resolver where you can determine gravity for item in position.
                //This method have priority over previous one
                .setGravityResolver(new IChildGravityResolver() {
                    @Override
                    public int getItemGravity(int position) {
                        return Gravity.CENTER;
                    }
                })
                //you are able to break row due to your conditions. Row breaker should return true for that views
                .setRowBreaker(new IRowBreaker() {
                    @Override
                    public boolean isItemBreakRow(@IntRange(from = 0) int position) {
                        return position == 6 || position == 11 || position == 2;
                    }
                })
                //a layoutOrientation of layout manager, could be VERTICAL OR HORIZONTAL. HORIZONTAL by default
                .setOrientation(ChipsLayoutManager.HORIZONTAL)
                // row strategy for views in completed row, could be STRATEGY_DEFAULT, STRATEGY_FILL_VIEW,
                //STRATEGY_FILL_SPACE or STRATEGY_CENTER
                .setRowStrategy(ChipsLayoutManager.STRATEGY_CENTER_DENSE)
                // whether strategy is applied to last row. FALSE by default
                .withLastRow(true)
                .build();
        mChipsAdapter = new ChipsAdapter(tagList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(chipsLayoutManager);
        recyclerView.addItemDecoration(new SpacingItemDecoration(getResources().getDimensionPixelOffset(R.dimen.horizontal_item_space),getResources().getDimensionPixelOffset(R.dimen.vertical_item_space)));
        recyclerView.setAdapter(mChipsAdapter);
    }

    @OnClick(R.id.button) public void removeItem(){
        tagList.remove(0);
        mChipsAdapter.notifyItemRemoved(0);
        //mChipsAdapter.notifyItemInserted(0);
        //mChipsAdapter.notifyItemRangeChanged(0,tagList.size());
    }
}
