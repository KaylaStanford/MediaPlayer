package com.example.android.mediaplayer;

public class songs {

        // Artist of the song
        private String ArtistName;
        // Song by the artist
        private String ArtistSong;
        //Artist Image
        private int ArtistImage;


        public songs(String artistName, String artistSong, int artistImage) {
            ArtistName = artistName;
            ArtistSong = artistSong;
            ArtistImage = artistImage;
        }

        public String getArtistName() {
            return ArtistName;
        }

        public String getArtistSong() {
            return ArtistSong;
        }

        public int getImageResourceId()
        { return ArtistImage; }


    }

