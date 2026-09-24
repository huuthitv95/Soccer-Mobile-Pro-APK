package com.iab.omid.library.chartboost.adsession;

import android.view.View;
import com.iab.omid.library.chartboost.utils.C11052g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C11052g.m23855a();
        C11052g.m23858a(adSessionConfiguration, "AdSessionConfiguration is null");
        C11052g.m23858a(adSessionContext, "AdSessionContext is null");
        return new C11021a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
