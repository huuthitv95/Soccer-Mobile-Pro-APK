package com.applovin.mediation.nativeAds.adPlacer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.C1561g5;
import com.applovin.mediation.MaxAd;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1846R;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public class MaxRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements MaxAdPlacer.Listener {

    /* JADX INFO: renamed from: a */
    private final MaxAdPlacer f4193a;

    /* JADX INFO: renamed from: b */
    private final RecyclerView.Adapter f4194b;

    /* JADX INFO: renamed from: c */
    private final C1844b f4195c;

    /* JADX INFO: renamed from: d */
    private RecyclerView f4196d;

    /* JADX INFO: renamed from: e */
    private C1561g5 f4197e;

    /* JADX INFO: renamed from: f */
    private MaxAdPlacer.Listener f4198f;

    /* JADX INFO: renamed from: g */
    private int f4199g;

    /* JADX INFO: renamed from: h */
    private AdPositionBehavior f4200h;

    /* JADX INFO: loaded from: classes3.dex */
    public enum AdPositionBehavior {
        DYNAMIC_EXCEPT_ON_APPEND,
        DYNAMIC,
        FIXED
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class MaxAdRecyclerViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        private final ViewGroup f4202a;

        public MaxAdRecyclerViewHolder(View view) {
            super(view);
            this.f4202a = (ViewGroup) view.findViewById(C1846R.id.applovin_native_ad_view_container);
        }

        public ViewGroup getContainerView() {
            return this.f4202a;
        }
    }

    /* JADX INFO: renamed from: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter$a */
    /* JADX INFO: loaded from: classes3.dex */
    class C1843a implements C1561g5.a {
        C1843a() {
        }

        @Override // com.applovin.impl.C1561g5.a
        /* JADX INFO: renamed from: a */
        public void mo2739a(int i, int i2) {
            MaxRecyclerAdapter.this.f4193a.updateFillablePositions(i, Math.min(i2 + MaxRecyclerAdapter.this.f4199g, MaxRecyclerAdapter.this.getItemCount() - 1));
        }
    }

    /* JADX INFO: renamed from: com.applovin.mediation.nativeAds.adPlacer.MaxRecyclerAdapter$b */
    /* JADX INFO: loaded from: classes3.dex */
    private class C1844b extends RecyclerView.AdapterDataObserver {
        private C1844b() {
        }

        /* synthetic */ C1844b(MaxRecyclerAdapter maxRecyclerAdapter, C1843a c1843a) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            int adjustedPosition = MaxRecyclerAdapter.this.f4193a.getAdjustedPosition(i);
            MaxRecyclerAdapter.this.notifyItemRangeChanged(adjustedPosition, (MaxRecyclerAdapter.this.f4193a.getAdjustedPosition((i + i2) - 1) - adjustedPosition) + 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            boolean z = i + i2 >= MaxRecyclerAdapter.this.f4194b.getItemCount();
            if (MaxRecyclerAdapter.this.f4200h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f4200h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f4193a.getAdjustedPosition(i);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f4193a.insertItem(adjustedPosition);
            }
            MaxRecyclerAdapter.this.notifyItemRangeInserted(adjustedPosition, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            MaxRecyclerAdapter.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            int itemCount = MaxRecyclerAdapter.this.f4194b.getItemCount();
            boolean z = i + i2 >= itemCount;
            if (MaxRecyclerAdapter.this.f4200h == AdPositionBehavior.FIXED || (MaxRecyclerAdapter.this.f4200h == AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND && z)) {
                MaxRecyclerAdapter.this.notifyDataSetChanged();
                return;
            }
            int adjustedPosition = MaxRecyclerAdapter.this.f4193a.getAdjustedPosition(i);
            int adjustedCount = MaxRecyclerAdapter.this.f4193a.getAdjustedCount(itemCount + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                MaxRecyclerAdapter.this.f4193a.removeItem(adjustedPosition);
            }
            int adjustedCount2 = MaxRecyclerAdapter.this.f4193a.getAdjustedCount(itemCount);
            int size = adjustedCount - adjustedCount2;
            Collection<Integer> collectionClearTrailingAds = MaxRecyclerAdapter.this.f4193a.clearTrailingAds(adjustedCount2 - 1);
            if (!collectionClearTrailingAds.isEmpty()) {
                size += collectionClearTrailingAds.size();
            }
            MaxRecyclerAdapter.this.notifyItemRangeRemoved(adjustedPosition - (size - i2), size);
        }
    }

    public MaxRecyclerAdapter(MaxAdPlacerSettings maxAdPlacerSettings, RecyclerView.Adapter adapter, Activity activity) {
        C1844b c1844b = new C1844b(this, null);
        this.f4195c = c1844b;
        this.f4199g = 8;
        this.f4200h = AdPositionBehavior.DYNAMIC_EXCEPT_ON_APPEND;
        MaxAdPlacer maxAdPlacer = new MaxAdPlacer(maxAdPlacerSettings, activity);
        this.f4193a = maxAdPlacer;
        maxAdPlacer.setListener(this);
        super.setHasStableIds(adapter.hasStableIds());
        this.f4194b = adapter;
        adapter.registerAdapterDataObserver(c1844b);
    }

    public void destroy() {
        try {
            this.f4194b.unregisterAdapterDataObserver(this.f4195c);
        } catch (Exception unused) {
        }
        this.f4193a.destroy();
        C1561g5 c1561g5 = this.f4197e;
        if (c1561g5 != null) {
            c1561g5.m2735a();
        }
    }

    public MaxAdPlacer getAdPlacer() {
        return this.f4193a;
    }

    public int getAdjustedPosition(int i) {
        return this.f4193a.getAdjustedPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f4193a.getAdjustedCount(this.f4194b.getItemCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (this.f4194b.hasStableIds()) {
            return this.f4193a.isFilledPosition(i) ? this.f4193a.getAdItemId(i) : this.f4194b.getItemId(this.f4193a.getOriginalPosition(i));
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f4193a.isAdPosition(i)) {
            return -42;
        }
        return this.f4194b.getItemViewType(this.f4193a.getOriginalPosition(i));
    }

    public int getOriginalPosition(int i) {
        return this.f4193a.getOriginalPosition(i);
    }

    public void loadAds() {
        this.f4193a.loadAds();
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdClicked(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f4198f;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdLoaded(int i) {
        notifyItemChanged(i);
        MaxAdPlacer.Listener listener = this.f4198f;
        if (listener != null) {
            listener.onAdLoaded(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRemoved(int i) {
        MaxAdPlacer.Listener listener = this.f4198f;
        if (listener != null) {
            listener.onAdRemoved(i);
        }
    }

    @Override // com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.Listener
    public void onAdRevenuePaid(MaxAd maxAd) {
        MaxAdPlacer.Listener listener = this.f4198f;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f4196d = recyclerView;
        C1561g5 c1561g5 = new C1561g5(recyclerView);
        this.f4197e = c1561g5;
        c1561g5.m2737a(new C1843a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.f4197e.m2736a(viewHolder.itemView, i);
        if (!this.f4193a.isAdPosition(i)) {
            this.f4194b.onBindViewHolder(viewHolder, this.f4193a.getOriginalPosition(i));
            return;
        }
        AppLovinSdkUtils.Size adSize = this.f4193a.getAdSize(i);
        ViewGroup containerView = ((MaxAdRecyclerViewHolder) viewHolder).getContainerView();
        ViewGroup.LayoutParams layoutParams = containerView.getLayoutParams();
        if (adSize == AppLovinSdkUtils.Size.ZERO) {
            layoutParams.width = -2;
            layoutParams.height = -2;
            containerView.setLayoutParams(layoutParams);
        } else {
            layoutParams.width = adSize.getWidth() < 0 ? adSize.getWidth() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getWidth());
            layoutParams.height = adSize.getHeight() < 0 ? adSize.getHeight() : AppLovinSdkUtils.dpToPx(containerView.getContext(), adSize.getHeight());
            containerView.setLayoutParams(layoutParams);
            this.f4193a.renderAd(i, containerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -42) {
            return this.f4194b.onCreateViewHolder(viewGroup, i);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1846R.layout.max_native_ad_recycler_view_item, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        RecyclerView.LayoutManager layoutManager = this.f4196d.getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            layoutParams.width = -1;
            layoutParams.height = -2;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
        }
        viewInflate.setLayoutParams(layoutParams);
        return new MaxAdRecyclerViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f4196d = null;
        C1561g5 c1561g5 = this.f4197e;
        if (c1561g5 != null) {
            c1561g5.m2735a();
            this.f4197e = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof MaxAdRecyclerViewHolder ? super.onFailedToRecycleView(viewHolder) : this.f4194b.onFailedToRecycleView(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f4194b.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof MaxAdRecyclerViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f4194b.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C1561g5 c1561g5 = this.f4197e;
        if (c1561g5 != null) {
            c1561g5.m2738b(viewHolder.itemView);
        }
        if (!(viewHolder instanceof MaxAdRecyclerViewHolder)) {
            this.f4194b.onViewRecycled(viewHolder);
            return;
        }
        if (this.f4193a.isFilledPosition(viewHolder.getBindingAdapterPosition())) {
            ((MaxAdRecyclerViewHolder) viewHolder).getContainerView().removeAllViews();
        }
        super.onViewRecycled(viewHolder);
    }

    public void setAdPositionBehavior(AdPositionBehavior adPositionBehavior) {
        this.f4200h = adPositionBehavior;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        this.f4194b.unregisterAdapterDataObserver(this.f4195c);
        this.f4194b.setHasStableIds(z);
        this.f4194b.registerAdapterDataObserver(this.f4195c);
    }

    public void setListener(MaxAdPlacer.Listener listener) {
        this.f4198f = listener;
    }

    public void setLookAhead(int i) {
        this.f4199g = i;
    }
}
