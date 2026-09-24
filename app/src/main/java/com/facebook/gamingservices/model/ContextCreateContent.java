package com.facebook.gamingservices.model;

import android.os.Parcel;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

/* JADX INFO: loaded from: classes4.dex */
public class ContextCreateContent implements ShareModel {
    private final String suggestedPlayerIDs;

    public static class Builder implements ShareModelBuilder<ContextCreateContent, Builder> {
        private String suggestedPlayerIDs;

        @Override // com.facebook.share.ShareBuilder
        public ContextCreateContent build() {
            return new ContextCreateContent(this);
        }

        Builder readFrom(Parcel parcel) {
            return readFrom((ContextCreateContent) parcel.readParcelable(ContextCreateContent.class.getClassLoader()));
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(ContextCreateContent contextCreateContent) {
            return contextCreateContent == null ? this : setSuggestedPlayerIDs(contextCreateContent.getSuggestedPlayerIDs());
        }

        public Builder setSuggestedPlayerIDs(String str) {
            this.suggestedPlayerIDs = str;
            return this;
        }
    }

    ContextCreateContent(Parcel parcel) {
        this.suggestedPlayerIDs = parcel.readString();
    }

    private ContextCreateContent(Builder builder) {
        this.suggestedPlayerIDs = builder.suggestedPlayerIDs;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSuggestedPlayerIDs() {
        return this.suggestedPlayerIDs;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.suggestedPlayerIDs);
    }
}
