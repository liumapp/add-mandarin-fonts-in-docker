# add-mandarin-fonts-in-docker
Add mandarin fonts in Docker . 

## how to use

* simple add mandarin fonts . 

* use fonts to replace /usr/share/fonts 

* check 

		docker exec -it nginx /bin/bash

		fc-list :lang=zh 

	if you find mandarin fonts in the list , then you are success .
	
## demo

* run ./build-image.sh

* run docker-compose up 

* the file /pdf/wrongpdf.pdf shows the wrong convert files without mandarin fonts. 

* the file /pdf/test.pdf shows the correct convert files with mandarin fonts.
	 		 		