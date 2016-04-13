package com.fchavez.jashinhurst.hw7.three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class test {
	public static void main(String[] args){
		
		try {
			FileReader file = new FileReader("songs.txt");
			BufferedReader in = new BufferedReader(file);
			ArrayList<iTunesKiller> songNames = new ArrayList<iTunesKiller>();
			
			String read = in.readLine();
			String[] split;
			while(read !=null){
				split = read.split(" - ");
				songNames.add(new iTunesKiller(split[1], split[0]));
				read = in.readLine();
			}
			iTunesKiller temp;
			
			for(int count = 0; Math.abs((double)count)<=5;count++){
				temp = songNames.get(songNames.size()/2 + count);
				iTunesKiller.addSong(temp.getArtist(), temp.getTitle());
				if(count > 0){
					temp = songNames.get(songNames.size()/2 - count);
					iTunesKiller.addSong(temp.getArtist(), temp.getTitle());
				}
				
			}
			iTunesKiller.viewPlayList();
			iTunesKiller.play();
			iTunesKiller.play();
			iTunesKiller.viewHistory();
			iTunesKiller.skipSong();
			iTunesKiller.viewSkipped();
			iTunesKiller.undoSkippedSong();
			iTunesKiller.viewSkipped();
			iTunesKiller.play();
			iTunesKiller.back();
			iTunesKiller.play();
			iTunesKiller.viewHistory();
			iTunesKiller.addSong("The Letter", "The Boxtops");
			iTunesKiller.play();
			iTunesKiller.play();
			iTunesKiller.play();
			iTunesKiller.play();
			iTunesKiller.viewHistory();
			iTunesKiller.skipSong();
			iTunesKiller.skipSong();
			iTunesKiller.skipSong();
			iTunesKiller.viewSkipped();
			iTunesKiller.viewPlayList();
			
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
