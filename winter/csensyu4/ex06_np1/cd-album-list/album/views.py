from django.shortcuts import render
from album.models import Albums, Tracks

# Create your views here.
def index(request):
    albums = Albums.objects.select_related("artist").all()
    return render(request, 'album/index.html', context=locals())

def detail(request, album_id):
    album = Albums.objects.get(pk=album_id)
    # tracks = album.tracks.all()
    tracks = Tracks.objects.select_related("genre").all().filter(album=album)
    return render(request, 'album/detail.html', context=locals())
