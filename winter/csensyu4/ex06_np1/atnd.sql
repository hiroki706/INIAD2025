SELECT tracks.name, albums.title
	FROM tracks LEFT OUTER JOIN albums ON tracks.album_id=albums.id
	WHERE albums.artist='Queen';
