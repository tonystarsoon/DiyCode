package com.plusend.diycode.model.user.view;

import com.plusend.diycode.model.base.BaseView;
import com.plusend.diycode.model.user.entity.UserDetailInfo;

/**
 * Created by plusend on 2016/11/28.
 */

public interface UserView extends BaseView {
    void getMe(UserDetailInfo userDetailInfo);

    void getUser(UserDetailInfo userDetailInfo);
}
