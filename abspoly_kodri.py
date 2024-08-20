from abc import ABC, abstractmethod

# metode abstrak
class Kendaraan(ABC):
    @abstractmethod
    def biayaSewa(self):
        pass

    @abstractmethod
    def extends(self):
        pass

class Mobil(Kendaraan):
    def biayaSewa(self):
        return 500000
    def extends(self):
        return 3

class Motor(Kendaraan):
    def biayaSewa(self):
        return 100000
    def extends(self):
        return 3

# perhitungan biaya metode abstrak
# def hitungBiaya(kendaraan):
#     return kendaraan.biayaSewa() * kendaraan.extends()

# Polymorphism
def hitungBiaya(kendaraan : Kendaraan):
    return kendaraan.biayaSewa() * kendaraan.extends()

mobil = Mobil()
motor = Motor()

print(f'Biaya Sewa Mobil : {hitungBiaya(mobil)}')
print(f'Biaya Sewa Motor : {hitungBiaya(motor)}')


