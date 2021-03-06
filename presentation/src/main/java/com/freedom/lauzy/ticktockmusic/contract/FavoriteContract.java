package com.freedom.lauzy.ticktockmusic.contract;

import com.freedom.lauzy.ticktockmusic.base.IBaseView;
import com.freedom.lauzy.ticktockmusic.model.SongEntity;

import java.util.List;

/**
 * Desc : 我的喜欢接口
 * Author : Lauzy
 * Date : 2017/9/13
 * Blog : http://www.jianshu.com/u/e76853f863a9
 * Email : freedompaladin@gmail.com
 */
public interface FavoriteContract {
    interface Presenter {
        void loadFavoriteSongs();

        void clearFavoriteSongs();

        void deleteFavoriteSong(long songId, int position);

    }

    interface View extends IBaseView {
        void getFavoriteSongs(List<SongEntity> songEntities);

        void emptyView();

        void clearSongs();

        void deleteFavoriteSong(int position);
    }
}
