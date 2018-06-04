# add-mandarin-fonts-in-docker
Add mandarin fonts in Docker . 

## how to use

* simple add mandarin fonts . 

* use fonts to replace /usr/share/fonts 

* check 

		docker exec -it nginx /bin/bash

		fc-list :lang=zh 

	if you find mandarin fonts in the list , then you are success . 		